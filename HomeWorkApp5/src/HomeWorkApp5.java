public class HomeWorkApp5 {
    public static void main(String[] args) {
        //Employee employee = new Employee ("Иванов Иван Иванович", "Инженер", "ivanovii@mail.ru", 100000, 35);
        //employee.employeePrint();
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee ("Сидоров Алексей Иванович", "Инженер", "sidorovai@mail.ru", 100000, 32);
        emplArray[1] = new Employee ("Яковлев Денис Владимирович", "Менеджер", "yakovlevdv@mail.ru", 50000, 37);
        emplArray[2] = new Employee ("Сычева Мария Борисовна", "Младший инженер", "sychevamb@mail.ru", 20000, 33);
        emplArray[3] = new Employee ("Сергеев Антон Сергеевич", "Системный администратор", "sergeevas@mail.ru", 65000, 50);
        emplArray[4] = new Employee ("Смирнова Екатерина Андреевна", "Секретарь", "smirnovaes@mail.ru", 15000, 20);

        for (int i = 0; i<emplArray.length; i++)
        {
            if (emplArray[i].age > 40){
                emplArray[i].employeePrint();
            }
        }

    }
}
