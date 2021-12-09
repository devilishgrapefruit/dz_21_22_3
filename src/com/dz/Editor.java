package com.dz;
import java.util.Scanner;

public class Editor {
    ICreateDocument iCreateDocument;

    public Editor(ICreateDocument iCreateDocument) {
        this.iCreateDocument = iCreateDocument;
    }

    void start() {
        Scanner sc = new Scanner(System.in);
        int command;
        while (true) {
            System.out.println("""
                    Выберите:
                    1. File -> New;
                    2. File -> Open;
                    3. File -> Save;
                    4. File -> Exit;
                    """);
            command = sc.nextInt();
            if (command == 1) {
                System.out.println("Создание редактора ");
                IDocument textDocument = iCreateDocument.CreateNew();
                System.out.println(textDocument.getType());
            } else if (command == 2) {
                System.out.println("Открытие редактора ");
                IDocument textDocument = iCreateDocument.CreateOpen();
                System.out.println(textDocument.getType());
            } else if (command == 3)
                System.out.println("Файл сохранен ");
            else if (command == 4) {
                System.out.println("Выход ");
                break;
            } else
                System.out.println("Ошибка ");
        }
    }
}
