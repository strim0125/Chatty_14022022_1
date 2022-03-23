package server;

public interface AuthService {
    /**
     * Метод получения никнейма по логину и паролю
     * @return null если учетка не найдена
     * @return nickname если учетка найдена
     * */
    String getNicknameByLoginAndPassword(String login, String password);

    /**
     * метод для регистрации учетной записи
     * @return true при успешной регистрации
     * @return false если логин или никнейм заняты, и регистрация не получилась
     * */
    boolean registration(String login, String password, String nickname);

    boolean changeNick(String oldNickname, String newNickname);
}
