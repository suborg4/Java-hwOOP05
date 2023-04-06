import service.UserServiceImpl;

// Рефакторинг одного из предыдущих дз с учетом паттерна MVC

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.start();
    }
}