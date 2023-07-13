package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa_vehicle");
             EntityManager em = emf.createEntityManager()) {

            // Заполняем данными нашу таблицу
            Vehicle bike = new Bike("R1", BigDecimal.valueOf(300.49), "Oil");
            Vehicle car = new Car("GT300", BigDecimal.valueOf(5300.01), "Petrol-100", 4);
            Vehicle plane = new Plane("AirSoft", BigDecimal.valueOf(50000.34), "Kerosin", "S9", 12);
            Vehicle truck = new Truck("Kamaz", BigDecimal.valueOf(3145.12), "Disel", 4.25);

            // Вывод информации о каждом созданном
            System.out.printf("Bike: %s%n", bike);
            System.out.printf("Car: %s%n", car);
            System.out.printf("Plane: %s%n", plane);
            System.out.printf("Truck: %s%n", truck);

            try {
                // Начало транзакции для выполнения операций сохранения объектов в базе данных.
                em.getTransaction().begin();

                // Сохраненяем объекты в PostgreSQL.
                em.persist(bike);
                em.persist(car);
                em.persist(plane);
                em.persist(truck);

                // Фиксация транзакции для сохранения изменений.
                em.getTransaction().commit();
            } catch (Exception e) {
                // Если возникла ошибка, откатываем транзакцию, чтобы ничего не сохранялось в базе данных.
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
        } // Закрываем EntityManager.
    }
}