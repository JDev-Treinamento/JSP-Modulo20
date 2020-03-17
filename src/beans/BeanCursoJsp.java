package beans;

public class BeanCursoJsp {

    private String login;

    private String senha;

    public boolean validarLoginSenha(String login, String senha) {
        return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
