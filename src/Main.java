public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " "+ firstName + " " + middleName;
        {
            System.out.println( "ФИО сотрудника-"+fullName);
        }
        //Задание 2
        String fullName1 = fullName.toUpperCase();
        {
            System.out.println("Данные ФИО сотрудника для заполнения отчета - "+ fullName1);
        }
        //Задание 3
        String fuullName2 = "Иванов Семён Семёнович";
        String fullName3 = fuullName2.replace('ё', 'е' );
        {
            System.out.println("Данные ФИО сотрудника- "+fullName3);
        }


    }
}