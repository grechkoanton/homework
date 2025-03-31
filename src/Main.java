public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //переменной dog значение 8.0;переменной cat значение 3.6;
        // переменной paper значение 763789.Вывести значения в консоль
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        //Для решения этой задачи используйте тип переменной var.
        //Выведите в консоль новые значения переменных.
        System.out.println();
        dog = 8.0 + 4;
        cat = 3.6 + 4;
        paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //dog уменьшить на 3.5; cat уменьшить на 1.6; paper уменьшить на 7639
        //Выведите в консоль новые значения переменных
        System.out.println();
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Инициализируйте (присвойте значение) переменную friend значением 19
        //Увеличьте значение переменной на 2, после чего поделите значение на 7
        //После каждой операции выводите значение переменной в консоль.
        // В итоге у вас должно быть выведено 3 значения одной переменной.
        //Для решения этой задачи используйте тип переменной var
        System.out.println();
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Инициализируйте переменную frog значением 3.5
        //Увеличьте переменную в 10 раз и поделите на 3.5.
        // Добавьте к последнему значению переменной 4.
        //После каждой операции выводите значение переменной в консоль.
        // В итоге у вас должно быть выведено 4 значения одной переменной.
        //Для решения этой задачи используйте тип переменной var.
        System.out.println();
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //В боксе перед каждым боем спортсменов взвешивают.
        // Это делают для того, чтобы убедиться, что боксеры
        // соответствуют своей весовой категории и бой будет честным.
        //Масса одного боксера — 78.2 кг.
        //Масса второго боксера — 82.7 кг.
        //Подсчитайте и выведите в консоль общую массу двух бойцов.
        //Подсчитайте и выведите в консоль разницу между массами бойцов.
        // Для решения этой задачи используйте тип переменной var.
        System.out.println();
        var theBoxerOne = 78.2;
        var theBoxerTwo = 82.7;
        System.out.println("Общая масса двух бойцов " + (theBoxerOne + theBoxerTwo) + " кг.");
        System.out.println("Разница между массами бойцов " + (theBoxerTwo - theBoxerOne) + " кг.");
        //Найдите остаток от деления между двумя весами.
        // Для решения этой задачи используйте тип переменной var.
        System.out.println();
        var remains = theBoxerTwo % theBoxerOne;
        System.out.println("Остаток от деления между двумя весами бойцов: " + remains + " кг.");
        //640 часов работы поделено между сотрудниками. Если каждый сотрудник
        // посвящает работе 8 часов, то сколько всего работников в компании?
        // Выведите результат задачи в консоль в формате:
        // «Всего работников в компании — … человек».
        // Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
        // если в компании работает на 94 человека больше.
        // Выведите результат задачи в консоль в формате:
        // «Если в компании работает … человек, то всего …
        // часов работы может быть поделено между сотрудниками».
        //Для решения этой задачи используйте тип переменной var
        System.out.println();
        var workHours = 640;
        var oneEmployee = 8;
        var totalEmployee = workHours / oneEmployee;
        System.out.println("Всего работников в компании — " + totalEmployee + " человек.");
        totalEmployee = totalEmployee + 94;
        workHours = totalEmployee * oneEmployee;
        System.out.println("Если в компании работает " + totalEmployee + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");

    }
}