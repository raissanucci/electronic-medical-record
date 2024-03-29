package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

/**
 * Created by raissanucci on 10/9/15.
 */
public enum IssuerOrgan {
    CARTEIRA_DE_IDENTIDADE_CLASSISTA(60, "CARTEIRA DE IDENTIDADE CLASSISTA"),
    CARTEIRA_NACIONAL_DE_HABILITAÇÃO(89, "CARTEIRA NACIONAL DE HABILITAÇÃO"),
    CONSELHO_REGIONAL_DE_ADMINISTRACAO(61, "CONSELHO REGIONAL DE ADMINISTRACAO"),
    CONSELHO_REGIONAL_DE_ASSISTENTES_SOCIAIS(62, "CONSELHO REGIONAL DE ASSISTENTES SOCIAIS"),
    CONSELHO_REGIONAL_DE_BIBLIOTECONOMIA(63, "CONSELHO REGIONAL DE BIBLIOTECONOMIA"),
    CONSELHO_REGIONAL_DE_CONTABILIDADE(64, "CONSELHO REGIONAL DE CONTABILIDADE"),
    CONSELHO_REGIONAL_DE_CORRETORES_DE_IMOVEIS(65, "CONSELHO REGIONAL DE CORRETORES DE IMOVEIS"),
    CONSELHO_REGIONAL_DE_ECONOMIA(83, "CONSELHO REGIONAL DE ECONOMIA"),
    CONSELHO_REGIONAL_DE_ENFERMAGEM(66, "CONSELHO REGIONAL DE ENFERMAGEM"),
    CONSELHO_REGIONAL_DE_ENGENHARIA_ARQUITETURA_E_AGRONOMIA(67, "CONSELHO REGIONAL DE ENGENHARIA ARQUITETURA E AGRONOMIA"),
    CONSELHO_REGIONAL_DE_ESTATISTICA(68, "CONSELHO REGIONAL DE ESTATISTICA"),
    CONSELHO_REGIONAL_DE_FARMACIA(69, "CONSELHO REGIONAL DE FARMACIA"),
    CONSELHO_REGIONAL_DE_FISIOTERAPIA_E_TERAPIA_OCUPACIONAL(70, "CONSELHO REGIONAL DE FISIOTERAPIA E TERAPIA OCUPACIONAL"),
    CONSELHO_REGIONAL_DE_MEDICINA(71, "CONSELHO REGIONAL DE MEDICINA"),
    CONSELHO_REGIONAL_DE_MEDICINA_VETERINARIA(72, "CONSELHO REGIONAL DE MEDICINA VETERINARIA"),
    CONSELHO_REGIONAL_DE_NUTRICAO(74, "CONSELHO REGIONAL DE NUTRICAO"),
    CONSELHO_REGIONAL_DE_ODONTOLOGIA(75, "CONSELHO REGIONAL DE ODONTOLOGIA"),
    CONSELHO_REGIONAL_DE_PROFISSIONAIS_DE_RELACOES_PUBLICAS(76, "CONSELHO REGIONAL DE PROFISSIONAIS DE RELACOES PUBLICAS"),
    CONSELHO_REGIONAL_DE_PSICOLOGIA(77, "CONSELHO REGIONAL DE PSICOLOGIA"),
    CONSELHO_REGIONAL_DE_QUIMICA(78, "CONSELHO REGIONAL DE QUIMICA"),
    CONSELHO_REGIONAL_DE_REPRESENTANTES_COMERCIAIS(79, "CONSELHO REGIONAL DE REPRESENTANTES COMERCIAIS"),
    DOCUMENTOS_ESTRANGEIROS(82, "DOCUMENTOS ESTRANGEIROS"),
    MINISTERIO_DA_AERONAUTICA(41, "MINISTERIO DA AERONAUTICA"),
    MINISTERIO_DA_MARINHA(43, "MINISTERIO DA MARINHA"),
    MINISTERIO_DO_EXERCITO(42, "MINISTERIO DO EXERCITO"),
    ORDEM_DOS_ADVOGADOS_DO_BRASIL(80, "ORDEM DOS ADVOGADOS DO BRASIL"),
    ORDENS_DOS_MUSICOS_DO_BRASIL(73, "ORDENS DOS MUSICOS DO BRASIL"),
    ORGANISMO_MILITAR_OU_MINISTERIO_DA_DEFESA(40, "ORGANISMO MILITAR OU MINISTERIO DA DEFESA"),
    OUTROS_EMISSORES(81, "OUTROS EMISSORES"),
    POLICIA_FEDERAL(44, "POLICIA FEDERAL"),
    SSP_SECRETARIA_DE_SEGURANCA_PUBLICA(10, "SSP - SECRETARIA DE SEGURANCA PUBLICA");

    private final int code;
    private final String description;

    private IssuerOrgan(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static IssuerOrgan findIssuerOrganByDescription(String description) {
        for(IssuerOrgan issuerOrgan : IssuerOrgan.values()) {
            if(description.toLowerCase().equals(issuerOrgan.description.toLowerCase())) {
                return issuerOrgan;
            }
        }

        return null;
    }
}
