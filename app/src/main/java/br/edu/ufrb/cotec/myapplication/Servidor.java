package br.edu.ufrb.cotec.myapplication; ;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Servidor implements Serializable {

    private Integer id;
    private Integer siape;
    private String categoriaFuncional;
    private String dataAdmissao;
    private String dataIngresso;
    private String jornadaTrabalho;
    private String cargo;
    private String unidadeExercicio;
    private String unidadeLotacao;
    private String formacao;
    private String situacaoSigrh;
    private String admissaoOrigem;
    private String regimeTrabalho;
    private String nomeServidor;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiape() {
        return siape;
    }

    public void setSiape(Integer siape) {
        this.siape = siape;
    }

    public String getCategoriaFuncional() {
        return categoriaFuncional;
    }

    public void setCategoriaFuncional(String categoriaFuncional) {
        this.categoriaFuncional = categoriaFuncional;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(String jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUnidadeExercicio() {
        return unidadeExercicio;
    }

    public void setUnidadeExercicio(String unidadeExercicio) {
        this.unidadeExercicio = unidadeExercicio;
    }

    public String getUnidadeLotacao() {
        return unidadeLotacao;
    }

    public void setUnidadeLotacao(String unidadeLotacao) {
        this.unidadeLotacao = unidadeLotacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getSituacaoSigrh() {
        return situacaoSigrh;
    }

    public void setSituacaoSigrh(String situacaoSigrh) {
        this.situacaoSigrh = situacaoSigrh;
    }

    public String getAdmissaoOrigem() {
        return admissaoOrigem;
    }

    public void setAdmissaoOrigem(String admissaoOrigem) {
        this.admissaoOrigem = admissaoOrigem;
    }

    public String getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}