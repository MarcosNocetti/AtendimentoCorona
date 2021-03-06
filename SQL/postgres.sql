PGDMP         )                x            postgres    9.4.26    12.2 M    -           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            .           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            /           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            0           1262    12135    postgres    DATABASE     �   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE postgres;
                postgres    false            1           0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    2096            2           0    0    SCHEMA public    ACL     �   REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   postgres    false    7                        3079    16384 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                   false            3           0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                        false    1            �            1259    16669    agendamento    TABLE     d  CREATE TABLE public.agendamento (
    agendamentoid integer NOT NULL,
    usuarioregistrador character varying(50) NOT NULL,
    nomepaciente character varying(50) NOT NULL,
    datavisita date NOT NULL,
    hora character varying(50) NOT NULL,
    status character varying(50) NOT NULL,
    personid integer,
    usuarioalterador character varying(50)
);
    DROP TABLE public.agendamento;
       public            postgres    false            �            1259    16667    agendamento_testeid_seq    SEQUENCE     �   CREATE SEQUENCE public.agendamento_testeid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.agendamento_testeid_seq;
       public          postgres    false    187            4           0    0    agendamento_testeid_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.agendamento_testeid_seq OWNED BY public.agendamento.agendamentoid;
          public          postgres    false    186            �            1259    16455    cadastro_usuario    TABLE     �   CREATE TABLE public.cadastro_usuario (
    usuarioid integer NOT NULL,
    usuario character varying(50),
    senha character varying(50),
    personid integer
);
 $   DROP TABLE public.cadastro_usuario;
       public            postgres    false            �            1259    16453    cadastro_usuario_usuarioid_seq    SEQUENCE     �   CREATE SEQUENCE public.cadastro_usuario_usuarioid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.cadastro_usuario_usuarioid_seq;
       public          postgres    false    179            5           0    0    cadastro_usuario_usuarioid_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.cadastro_usuario_usuarioid_seq OWNED BY public.cadastro_usuario.usuarioid;
          public          postgres    false    178            �            1259    16578    cidades    TABLE     �   CREATE TABLE public.cidades (
    codigo_cidade integer NOT NULL,
    estado character varying(30) NOT NULL,
    nomecidade character varying(30) NOT NULL
);
    DROP TABLE public.cidades;
       public            postgres    false            �            1259    16576    cidades_codigo_cidade_seq    SEQUENCE     �   CREATE SEQUENCE public.cidades_codigo_cidade_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.cidades_codigo_cidade_seq;
       public          postgres    false    185            6           0    0    cidades_codigo_cidade_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.cidades_codigo_cidade_seq OWNED BY public.cidades.codigo_cidade;
          public          postgres    false    184            �            1259    16504    equipedesaude    TABLE     �   CREATE TABLE public.equipedesaude (
    integranteequipedesaudeid integer NOT NULL,
    codigoespecial character varying(100) NOT NULL,
    personid integer
);
 !   DROP TABLE public.equipedesaude;
       public            postgres    false            �            1259    16502 +   equipedesaude_integranteequipedesaudeid_seq    SEQUENCE     �   CREATE SEQUENCE public.equipedesaude_integranteequipedesaudeid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 B   DROP SEQUENCE public.equipedesaude_integranteequipedesaudeid_seq;
       public          postgres    false    183            7           0    0 +   equipedesaude_integranteequipedesaudeid_seq    SEQUENCE OWNED BY     {   ALTER SEQUENCE public.equipedesaude_integranteequipedesaudeid_seq OWNED BY public.equipedesaude.integranteequipedesaudeid;
          public          postgres    false    182            �            1259    16850    forum    TABLE     6  CREATE TABLE public.forum (
    forumid integer NOT NULL,
    usuariomensagem character varying(50) NOT NULL,
    mensagem character varying(250) NOT NULL,
    datamensagem date NOT NULL,
    horamensagem character varying(50) NOT NULL,
    tipousuario character varying(50) NOT NULL,
    usuarioid integer
);
    DROP TABLE public.forum;
       public            postgres    false            �            1259    16848    forum_forumid_seq    SEQUENCE     z   CREATE SEQUENCE public.forum_forumid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.forum_forumid_seq;
       public          postgres    false    191            8           0    0    forum_forumid_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.forum_forumid_seq OWNED BY public.forum.forumid;
          public          postgres    false    190            �            1259    16449    paciente    TABLE     �   CREATE TABLE public.paciente (
    pacienteid integer NOT NULL,
    descricaosintomas character varying(50),
    personid integer
);
    DROP TABLE public.paciente;
       public            postgres    false            �            1259    16447    paciente_pacienteid_seq    SEQUENCE     �   CREATE SEQUENCE public.paciente_pacienteid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.paciente_pacienteid_seq;
       public          postgres    false    177            9           0    0    paciente_pacienteid_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.paciente_pacienteid_seq OWNED BY public.paciente.pacienteid;
          public          postgres    false    176            �            1259    16419    pesquisa    TABLE     -  CREATE TABLE public.pesquisa (
    codigo integer NOT NULL,
    nome character varying(50) NOT NULL,
    telefone character varying(50) NOT NULL,
    preco integer NOT NULL,
    tipo character varying(45) NOT NULL,
    hora character varying(45) NOT NULL,
    email character varying(100) NOT NULL
);
    DROP TABLE public.pesquisa;
       public            postgres    false            �            1259    16417    pesquisa_codigo_seq    SEQUENCE     |   CREATE SEQUENCE public.pesquisa_codigo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.pesquisa_codigo_seq;
       public          postgres    false    175            :           0    0    pesquisa_codigo_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.pesquisa_codigo_seq OWNED BY public.pesquisa.codigo;
          public          postgres    false    174            �            1259    16479    pessoa    TABLE       CREATE TABLE public.pessoa (
    personid integer NOT NULL,
    nome character varying(50),
    sexo character varying(50),
    idade character varying(100),
    email character varying(100),
    telefone character varying(100),
    estado character varying(100),
    cidade character varying(100),
    rua character varying(100),
    bairro character varying(100),
    numcasa character varying(100),
    complemento character varying(100),
    cep character varying(100),
    cpf character varying(100),
    rg character varying(100)
);
    DROP TABLE public.pessoa;
       public            postgres    false            �            1259    16477    pessoa_personid_seq    SEQUENCE     |   CREATE SEQUENCE public.pessoa_personid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.pessoa_personid_seq;
       public          postgres    false    181            ;           0    0    pessoa_personid_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.pessoa_personid_seq OWNED BY public.pessoa.personid;
          public          postgres    false    180            �            1259    16683 
   testecovid    TABLE     �   CREATE TABLE public.testecovid (
    testeid integer NOT NULL,
    usuarioregistrador character varying(50) NOT NULL,
    nomepaciente character varying(50) NOT NULL,
    resultado boolean NOT NULL,
    agendamentoid integer
);
    DROP TABLE public.testecovid;
       public            postgres    false            �            1259    16681    testecovid_testeid_seq    SEQUENCE        CREATE SEQUENCE public.testecovid_testeid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.testecovid_testeid_seq;
       public          postgres    false    189            <           0    0    testecovid_testeid_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.testecovid_testeid_seq OWNED BY public.testecovid.testeid;
          public          postgres    false    188            �           2604    16672    agendamento agendamentoid    DEFAULT     �   ALTER TABLE ONLY public.agendamento ALTER COLUMN agendamentoid SET DEFAULT nextval('public.agendamento_testeid_seq'::regclass);
 H   ALTER TABLE public.agendamento ALTER COLUMN agendamentoid DROP DEFAULT;
       public          postgres    false    186    187    187            �           2604    16458    cadastro_usuario usuarioid    DEFAULT     �   ALTER TABLE ONLY public.cadastro_usuario ALTER COLUMN usuarioid SET DEFAULT nextval('public.cadastro_usuario_usuarioid_seq'::regclass);
 I   ALTER TABLE public.cadastro_usuario ALTER COLUMN usuarioid DROP DEFAULT;
       public          postgres    false    178    179    179            �           2604    16581    cidades codigo_cidade    DEFAULT     ~   ALTER TABLE ONLY public.cidades ALTER COLUMN codigo_cidade SET DEFAULT nextval('public.cidades_codigo_cidade_seq'::regclass);
 D   ALTER TABLE public.cidades ALTER COLUMN codigo_cidade DROP DEFAULT;
       public          postgres    false    184    185    185            �           2604    16507 '   equipedesaude integranteequipedesaudeid    DEFAULT     �   ALTER TABLE ONLY public.equipedesaude ALTER COLUMN integranteequipedesaudeid SET DEFAULT nextval('public.equipedesaude_integranteequipedesaudeid_seq'::regclass);
 V   ALTER TABLE public.equipedesaude ALTER COLUMN integranteequipedesaudeid DROP DEFAULT;
       public          postgres    false    183    182    183            �           2604    16853    forum forumid    DEFAULT     n   ALTER TABLE ONLY public.forum ALTER COLUMN forumid SET DEFAULT nextval('public.forum_forumid_seq'::regclass);
 <   ALTER TABLE public.forum ALTER COLUMN forumid DROP DEFAULT;
       public          postgres    false    190    191    191            �           2604    16452    paciente pacienteid    DEFAULT     z   ALTER TABLE ONLY public.paciente ALTER COLUMN pacienteid SET DEFAULT nextval('public.paciente_pacienteid_seq'::regclass);
 B   ALTER TABLE public.paciente ALTER COLUMN pacienteid DROP DEFAULT;
       public          postgres    false    177    176    177            �           2604    16422    pesquisa codigo    DEFAULT     r   ALTER TABLE ONLY public.pesquisa ALTER COLUMN codigo SET DEFAULT nextval('public.pesquisa_codigo_seq'::regclass);
 >   ALTER TABLE public.pesquisa ALTER COLUMN codigo DROP DEFAULT;
       public          postgres    false    175    174    175            �           2604    16482    pessoa personid    DEFAULT     r   ALTER TABLE ONLY public.pessoa ALTER COLUMN personid SET DEFAULT nextval('public.pessoa_personid_seq'::regclass);
 >   ALTER TABLE public.pessoa ALTER COLUMN personid DROP DEFAULT;
       public          postgres    false    180    181    181            �           2604    16686    testecovid testeid    DEFAULT     x   ALTER TABLE ONLY public.testecovid ALTER COLUMN testeid SET DEFAULT nextval('public.testecovid_testeid_seq'::regclass);
 A   ALTER TABLE public.testecovid ALTER COLUMN testeid DROP DEFAULT;
       public          postgres    false    189    188    189            &          0    16669    agendamento 
   TABLE DATA           �   COPY public.agendamento (agendamentoid, usuarioregistrador, nomepaciente, datavisita, hora, status, personid, usuarioalterador) FROM stdin;
    public          postgres    false    187   �\                 0    16455    cadastro_usuario 
   TABLE DATA           O   COPY public.cadastro_usuario (usuarioid, usuario, senha, personid) FROM stdin;
    public          postgres    false    179   z]       $          0    16578    cidades 
   TABLE DATA           D   COPY public.cidades (codigo_cidade, estado, nomecidade) FROM stdin;
    public          postgres    false    185   �^       "          0    16504    equipedesaude 
   TABLE DATA           \   COPY public.equipedesaude (integranteequipedesaudeid, codigoespecial, personid) FROM stdin;
    public          postgres    false    183   �^       *          0    16850    forum 
   TABLE DATA           w   COPY public.forum (forumid, usuariomensagem, mensagem, datamensagem, horamensagem, tipousuario, usuarioid) FROM stdin;
    public          postgres    false    191   G_                 0    16449    paciente 
   TABLE DATA           K   COPY public.paciente (pacienteid, descricaosintomas, personid) FROM stdin;
    public          postgres    false    177   �`                 0    16419    pesquisa 
   TABLE DATA           T   COPY public.pesquisa (codigo, nome, telefone, preco, tipo, hora, email) FROM stdin;
    public          postgres    false    175   ga                  0    16479    pessoa 
   TABLE DATA           �   COPY public.pessoa (personid, nome, sexo, idade, email, telefone, estado, cidade, rua, bairro, numcasa, complemento, cep, cpf, rg) FROM stdin;
    public          postgres    false    181   �a       (          0    16683 
   testecovid 
   TABLE DATA           i   COPY public.testecovid (testeid, usuarioregistrador, nomepaciente, resultado, agendamentoid) FROM stdin;
    public          postgres    false    189   Td       =           0    0    agendamento_testeid_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.agendamento_testeid_seq', 11, true);
          public          postgres    false    186            >           0    0    cadastro_usuario_usuarioid_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.cadastro_usuario_usuarioid_seq', 27, true);
          public          postgres    false    178            ?           0    0    cidades_codigo_cidade_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.cidades_codigo_cidade_seq', 4, true);
          public          postgres    false    184            @           0    0 +   equipedesaude_integranteequipedesaudeid_seq    SEQUENCE SET     Y   SELECT pg_catalog.setval('public.equipedesaude_integranteequipedesaudeid_seq', 4, true);
          public          postgres    false    182            A           0    0    forum_forumid_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.forum_forumid_seq', 20, true);
          public          postgres    false    190            B           0    0    paciente_pacienteid_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.paciente_pacienteid_seq', 23, true);
          public          postgres    false    176            C           0    0    pesquisa_codigo_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.pesquisa_codigo_seq', 1, false);
          public          postgres    false    174            D           0    0    pessoa_personid_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.pessoa_personid_seq', 20, true);
          public          postgres    false    180            E           0    0    testecovid_testeid_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.testecovid_testeid_seq', 4, true);
          public          postgres    false    188            �           2606    16674    agendamento agendamento_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.agendamento
    ADD CONSTRAINT agendamento_pkey PRIMARY KEY (agendamentoid);
 F   ALTER TABLE ONLY public.agendamento DROP CONSTRAINT agendamento_pkey;
       public            postgres    false    187            �           2606    16847 &   cadastro_usuario cadastro_usuario_pkey 
   CONSTRAINT     k   ALTER TABLE ONLY public.cadastro_usuario
    ADD CONSTRAINT cadastro_usuario_pkey PRIMARY KEY (usuarioid);
 P   ALTER TABLE ONLY public.cadastro_usuario DROP CONSTRAINT cadastro_usuario_pkey;
       public            postgres    false    179            �           2606    16583    cidades cidades_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.cidades
    ADD CONSTRAINT cidades_pkey PRIMARY KEY (codigo_cidade);
 >   ALTER TABLE ONLY public.cidades DROP CONSTRAINT cidades_pkey;
       public            postgres    false    185            �           2606    16509     equipedesaude equipedesaude_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.equipedesaude
    ADD CONSTRAINT equipedesaude_pkey PRIMARY KEY (integranteequipedesaudeid);
 J   ALTER TABLE ONLY public.equipedesaude DROP CONSTRAINT equipedesaude_pkey;
       public            postgres    false    183            �           2606    16855    forum forum_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.forum
    ADD CONSTRAINT forum_pkey PRIMARY KEY (forumid);
 :   ALTER TABLE ONLY public.forum DROP CONSTRAINT forum_pkey;
       public            postgres    false    191            �           2606    16862    paciente paciente_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT paciente_pkey PRIMARY KEY (pacienteid);
 @   ALTER TABLE ONLY public.paciente DROP CONSTRAINT paciente_pkey;
       public            postgres    false    177            �           2606    16424    pesquisa pesquisa_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.pesquisa
    ADD CONSTRAINT pesquisa_pkey PRIMARY KEY (codigo);
 @   ALTER TABLE ONLY public.pesquisa DROP CONSTRAINT pesquisa_pkey;
       public            postgres    false    175            �           2606    16586    pessoa pessoa_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT pessoa_pkey PRIMARY KEY (personid);
 <   ALTER TABLE ONLY public.pessoa DROP CONSTRAINT pessoa_pkey;
       public            postgres    false    181            �           2606    16688    testecovid testecovid_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.testecovid
    ADD CONSTRAINT testecovid_pkey PRIMARY KEY (testeid);
 D   ALTER TABLE ONLY public.testecovid DROP CONSTRAINT testecovid_pkey;
       public            postgres    false    189            �           2606    16689 .   testecovid fk_agendamento_id_pk_agendamento_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.testecovid
    ADD CONSTRAINT fk_agendamento_id_pk_agendamento_id FOREIGN KEY (agendamentoid) REFERENCES public.agendamento(agendamentoid);
 X   ALTER TABLE ONLY public.testecovid DROP CONSTRAINT fk_agendamento_id_pk_agendamento_id;
       public          postgres    false    189    187    1953            �           2606    16856 3   forum fk_cadastro_usuario_id_pk_cadastro_usuario_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.forum
    ADD CONSTRAINT fk_cadastro_usuario_id_pk_cadastro_usuario_id FOREIGN KEY (usuarioid) REFERENCES public.cadastro_usuario(usuarioid);
 ]   ALTER TABLE ONLY public.forum DROP CONSTRAINT fk_cadastro_usuario_id_pk_cadastro_usuario_id;
       public          postgres    false    1945    179    191            �           2606    16587 *   cadastro_usuario fk_person_id_pk_person_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.cadastro_usuario
    ADD CONSTRAINT fk_person_id_pk_person_id FOREIGN KEY (personid) REFERENCES public.pessoa(personid);
 T   ALTER TABLE ONLY public.cadastro_usuario DROP CONSTRAINT fk_person_id_pk_person_id;
       public          postgres    false    181    1947    179            �           2606    16592 "   paciente fk_person_id_pk_person_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT fk_person_id_pk_person_id FOREIGN KEY (personid) REFERENCES public.pessoa(personid);
 L   ALTER TABLE ONLY public.paciente DROP CONSTRAINT fk_person_id_pk_person_id;
       public          postgres    false    177    181    1947            �           2606    16597 '   equipedesaude fk_person_id_pk_person_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.equipedesaude
    ADD CONSTRAINT fk_person_id_pk_person_id FOREIGN KEY (personid) REFERENCES public.pessoa(personid);
 Q   ALTER TABLE ONLY public.equipedesaude DROP CONSTRAINT fk_person_id_pk_person_id;
       public          postgres    false    1947    183    181            �           2606    16675 %   agendamento fk_person_id_pk_person_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.agendamento
    ADD CONSTRAINT fk_person_id_pk_person_id FOREIGN KEY (personid) REFERENCES public.pessoa(personid);
 O   ALTER TABLE ONLY public.agendamento DROP CONSTRAINT fk_person_id_pk_person_id;
       public          postgres    false    187    181    1947            &   �   x�u�A�@EםSpL[f``GXJ`3�I$.o�)��1eL��{�����i:;�,02�(Cրi!Tvl�i�O"��@���?�	f�õw�ߧ�><^ʐ���/��LA�_��[��:6��|����{�>�J�Q�[�n�����}P��@�s�W�>!^�f�           x�]PMO�0=��T���7$6��]�%e��EL����&���ٱ�G�wO Y��,$��|�NP��TNˎ�k�\�c��V�]�Tȱ��a]���-.��3tX|���
Mh����Lo)"��Ci�}�$�	���HR�T"�%�v���qʇ���%����*�o���ض;��^t���ӤB���+Y ��ƫg���ξg�ji�S��*ӵN#��io���*����
���f�c�>dF���8��RY���5�I{ϠJH�:�� ��,��A�X��      $   J   x�3�tL.JU�pt��,N�T�I�2�2�tNM,:�PA��U��$��$��E,$?W�IO��(39�85�+F��� ��      "   =   x�3��(143401����2��12�4�s�9S�S���9͹L83����9��b���� [rG      *   2  x����n�0�g�)�����mUUahK�e��)@p�>ZּX���oW���=G���ؑ��j�ա!����7""\�<!/WS]�i`�z�5N�$Z��	�?��X%�']�vlk���J���]������	�?����cM����p��#��C�!w֙���$wT�ǇQ�I����nxvpoKU8#>H\���
�Z�Y���\�#��\MZ����~��V�(0�����E4LGci��zr�8�V�"�<�8��t��d�����v1�/�UDt8��y�OU�4�ÖR���         �   x�MPIn�0<�^����>��Kr�E�Ա���M�ҏEd�� �5�81-���x|�юs7;e�h��G���K��%߻�P�h�c����'��;���P����h{�"OQ��IYxJZ��H�ۼ4�p��{h�A�i�H?Q�������s�~���KKQ��W�.�(6x�~u���h����DRrR��k͹2�< H�f            x������ � �          �  x��U�R�0>��B�pa���[C�S
�Nz��r�bǌ�����Qx��,'�!�]�ҧ��[)V�`�-<ܟmL��}�-�W�e]�|����;m�}Un�O��r���{�s� *�B�i�e]벺̚0MS��A�����5���)���ـB(d�����rms�"S	X�5@�����s_a���!b�~��w�H&(ɀ�[��$�|�bl ���RW!�:sW*RJ7~$F��8��pas��������'�"�kj�
�A�HB��bO��E���2t�9�'Cs.���v���0<[�B��D��>�w�8NЧ����_�V��V�bC��K�tw�5�����6 vTi�U�z����W���0o�}�[�����|���ZCP�]J�Bu��:G1�[�0�}��g�������_�e��f��M����٦ܖ0��Ҵ����t�D���~g~5��8�(�0Md���
b��%ӥ0��X��tw&��ݙ���L�嶝�=N�0������#D���I���9D��A9�)xJ�r�$��Yi��sD��ߓ���J���a*\����t�3L闣ޛ�"(c��=�	 �g�����)y�a�c	W˻{�S���%��;��U*Pa�9�ޑ��i�=n~��Lw�0o������-�ĥc�,v�����%c�?��B      (   @   x�3�t����)MN,Vp���,�4�2BK�c�34�2A����Up�H,K-�14����� �R     