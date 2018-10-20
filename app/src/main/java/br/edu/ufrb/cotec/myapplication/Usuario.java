package br.edu.ufrb.cotec.myapplication; ;

import java.util.HashMap;
import java.util.Map;

public class Usuario {

    private String login;
    private Integer idPessoa;
    private String nome;
    private Integer idRegistroEntrada;
    private String email;
    private Boolean inativo;
    private String tokenAutenticacao;
    private Integer idFoto;
    private String chaveFoto;
    private Servidor servidor;
    private Integer id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdRegistroEntrada() {
        return idRegistroEntrada;
    }

    public void setIdRegistroEntrada(Integer idRegistroEntrada) {
        this.idRegistroEntrada = idRegistroEntrada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public String getTokenAutenticacao() {
        return tokenAutenticacao;
    }

    public void setTokenAutenticacao(String tokenAutenticacao) {
        this.tokenAutenticacao = tokenAutenticacao;
    }

    public Integer getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Integer idFoto) {
        this.idFoto = idFoto;
    }

    public String getChaveFoto() {
        return chaveFoto;
    }

    public void setChaveFoto(String chaveFoto) {
        this.chaveFoto = chaveFoto;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}