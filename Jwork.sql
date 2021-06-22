--
-- PostgreSQL database dump
--

-- Dumped from database version 12.4
-- Dumped by pg_dump version 12.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: jobseeker; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jobseeker (
    id integer,
    name character varying(50),
    email character varying(50),
    password character varying(50),
    date date
);


ALTER TABLE public.jobseeker OWNER TO postgres;

--
-- Data for Name: jobseeker; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.jobseeker (id, name, email, password, date) FROM stdin;
1	Gilbert			2021-06-22
2	Gilbert		Gibu123	2021-06-22
3	Gilbert		Gibu123	2021-06-22
4	Gilbert		Gibu123	2021-06-22
5	Gilbert		Gibu123	2021-06-22
6	Gilbert		Gibu123	2021-06-22
7	Gilbert		Gibu123	2021-06-23
8	Gilbert		Gibu123	2021-06-23
9	Gilbert		Gibu123	2021-06-23
10	Gimi	gimi@gmail.com	Gimi123	2021-06-23
11	Gilbert	gilbert@gmail.com	Gibu123	2021-06-23
12	Gilbert	gilbert@gmail.com	Gibu123	2021-06-23
13				2021-06-23
14	Gilbert	gibu@gmail.com	Gibu123	2021-06-23
\.


--
-- Name: jobseeker jobseeker_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jobseeker
    ADD CONSTRAINT jobseeker_id_key UNIQUE (id);


--
-- PostgreSQL database dump complete
--

