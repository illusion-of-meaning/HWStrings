public class Main {
    public static void main(String[] args) {
        // task1
        String fullName = getFullName("Ivanov", "Ivan", "Ivanovich");
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2
        final String fullNameUpper = toUpperText(fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        // task 3
        fullName = "Иванов Семён Семёнович";
        final String fullNameReplaced = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplaced);
    }

    private static String getFullName(String lastName, String firstName, String middleName) {
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        return fullName;
    }

    private static String toUpperText(String str) {
        str = str.toUpperCase();
        return str;
    }
}