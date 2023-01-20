public class Car11 {
    int age = 0;
    int power = 50;
    int turbo = 10;

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power * 10 + turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}

