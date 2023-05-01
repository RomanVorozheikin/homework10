package ru.roman;

public class Main {
    public static void main(String[] args) {

//        task1_2();
        task3();
    }
    private static void task1_2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String astName = "Ivanov";
        String fullName = astName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника- "+fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    private static void task3(){
        String fullName="Иванов Семён Семёнович";
        fullName=fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — "+fullName);
    }
}
