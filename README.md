# 🧠 BattleForgeDex

> Plataforma fullstack para visualizar cartas del TCG de Pokémon, construir mazos personalizados y simular batallas con inteligencia artificial.

![banner](https://www.tcgdex.net/assets/og.png)

---

## 🚀 Descripción

**BattleForgeDex** es una aplicación web desarrollada con **Spring Boot 3.4.5** y **Angular 20**, que permite:

- 🔎 Explorar todas las cartas oficiales del TCG de Pokémon (vía [TCGdex.net](https://www.tcgdex.net))
- 🧩 Crear y guardar mazos personalizados
- ⚔️ Simular batallas con IA y obtener estadísticas de winrate
- 🧠 Desplegar un entorno moderno, responsive y atractivo visualmente

Este proyecto forma parte de mi portfolio profesional para demostrar dominio en:

- Arquitectura fullstack moderna
- APIs RESTful y microservicios
- Integración con APIs públicas
- Angular SPA con diseño responsivo y gamificado
- Seguridad y autenticación (JWT)
- Simulación de batallas por IA (Python, en desarrollo)

---

## 🧱 Arquitectura del proyecto

---

## ⚙️ Tecnologías principales

| Capa        | Tecnología            | Versión         |
|-------------|------------------------|------------------|
| Backend     | Spring Boot            | 3.4.5           |
| Frontend    | Angular                | 20.x            |
| Base de datos | PostgreSQL           | Latest          |
| Seguridad   | Spring Security + JWT | (próximamente)  |
| Simulador   | Python + IA (API)     | (futuro)        |
| Infraestructura | Docker + Compose  | Latest          |
| API externa | [TCGdex.net](https://www.tcgdex.net) | v2 |

---

## 🔗 API usada

- TCGdex.net  
  - 🌐 URL base: `https://api.tcgdex.net/v2/es/cards`
  - ✅ Acceso libre, sin autenticación
  - 🌍 Soporte para varios idiomas

---

## 🛠️ Cómo ejecutar localmente

### Requisitos previos

- Java 17+
- Node.js 20+
- Docker + Docker Compose
- Angular CLI instalado globalmente (`npm install -g @angular/cli`)

### 1. Clona el proyecto

```bash
git clone https://github.com/tuusuario/BattleForgeDex.git
cd BattleForgeDex
# BattleForgeDex
