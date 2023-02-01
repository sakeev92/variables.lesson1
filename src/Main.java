public class Main {
    public static void main(String[] args) {


        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        System.out.println("Задача2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeigt = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeigt + " кг");
        var differenceBoxer = boxerTwo - boxerOne;
        System.out.println("Разница веса между бойцами " + differenceBoxer + " кг");

        System.out.println("Задача7");
        var differenceMaxMin = boxerTwo - boxerOne;
        System.out.println("Разница весов спортсменов:");
        System.out.println("1.Вычитание, составило " + differenceMaxMin + " кг");
        var remains = boxerTwo % boxerOne;
        System.out.println("2.Функция остаток, составило " + remains + " кг!");


        System.out.println("Задача8");
        var totalHours = 640;
        var employees = totalHours / 8;
        System.out.println("Всего работников в кампании - " + employees);
        var totalEmployess = employees + 94;
        var hoursWork = totalEmployess * 8;
        System.out.println("Если в компании работает " +totalEmployess + " человека, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками");

    }}