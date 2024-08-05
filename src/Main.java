public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);

        dog =   dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Новое значение переменной dog = " + dog);
        System.out.println("Новое значение переменной cat = " + cat);
        System.out.println("Новое значение переменной paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Новое значение переменной dog = " + dog);
        System.out.println("Новое значение переменной cat = " + cat);
        System.out.println("Новое значение переменной paper = " + paper);


        var friend = 19;
        System.out.println("Значение переменной friend = " + friend);
        friend = friend + 2;
        System.out.println("Новое значение переменной friend = " + friend);
        friend = friend / 7;
        System.out.println("Новое значение переменной friend = " + friend);

        var frog = 3.5;
        System.out.println("Значение переменной frog = " + frog);
        frog = friend * 10;
        System.out.println("Новое значение переменной frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Новое значение переменной frog = " + frog);
        frog =  frog + 4;
        System.out.println("Новое значение переменной frog = " + frog);

        var boxer1weight = 78.2;
        var boxer2weight = 82.7;
        System.out.println("Масса первого боксера " + boxer1weight + "кг");
        System.out.println("Масса второго боксера " + boxer2weight + "кг");
        var totalWeight = boxer1weight + boxer2weight;
        System.out.println("Общая масса двух боксеров " + totalWeight + "кг");
        var weightDifference = boxer2weight - boxer1weight;
        System.out.println("Разница в массе двух боксеров " + weightDifference + "кг");

        var num1 = 5;
        var num2 = 7;
        var result = num2 % num1;
        System.out.println("Остаток от деления 7 на 5 равно " + result);

        var totalHours = 640;
        var employeeHours = 8;
        var employees = totalHours / employeeHours;
        System.out.println("Всего работников в компании - " + employees + " человек");
        var newEmployees = employees + 94;
        var totalEmployeeHours = newEmployees * employeeHours;
        System.out.println("Если в компании работает " + newEmployees + " человек, то всего " + totalEmployeeHours + " часов работы может быть поделено между сотрудниками.");

    }
}