// Interface Notificador
interface Notificador {
    void enviarMensagem(String mensagem);
}

// Implementações concretas
class NotificadorEmail implements Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}

class NotificadorSMS implements Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

class NotificadorPush implements Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Push Notification: " + mensagem);
    }
}

// Classe abstrata (Factory)
abstract class NotificadorFactory {
    public abstract Notificador criarNotificador();
}

// Fábricas concretas
class EmailFactory extends NotificadorFactory {
    public Notificador criarNotificador() {
        return new NotificadorEmail();
    }
}

class SMSFactory extends NotificadorFactory {
    public Notificador criarNotificador() {
        return new NotificadorSMS();
    }
}

class PushFactory extends NotificadorFactory {
    public Notificador criarNotificador() {
        return new NotificadorPush();
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // E-mail
        NotificadorFactory emailFactory = new EmailFactory();
        Notificador email = emailFactory.criarNotificador();
        email.enviarMensagem("Olá por E-mail!");

        // SMS
        NotificadorFactory smsFactory = new SMSFactory();
        Notificador sms = smsFactory.criarNotificador();
        sms.enviarMensagem("Olá por SMS!");

        // Push Notification
        NotificadorFactory pushFactory = new PushFactory();
        Notificador push = pushFactory.criarNotificador();
        push.enviarMensagem("Olá por Push Notification!");
    }
}
