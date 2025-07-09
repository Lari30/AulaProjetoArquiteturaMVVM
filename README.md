# 🏛️ Projeto Exemplo – Arquitetura **MVVM** em Android

> Repositório da aula **“Projeto Arquitetura MVVM”** (prof. Jamilton Damasceno).  
> O app demonstra implementação completa de MVVM com ViewModel, LiveData, Repository e consumo de API via Retrofit.

![Badge Kotlin](https://img.shields.io/badge/Kotlin-1.9.x-purple?logo=kotlin)
![Badge MVVM](https://img.shields.io/badge/Pattern-MVVM-informational)
![Badge Android](https://img.shields.io/badge/Android-API%2024%2B-green?logo=android)

---

## 🚀 Funcionalidades

- Lista de usuários obtidos de API pública (JSONPlaceholder)
- Tela de detalhes ao clicar em um usuário
- Camada `Repository` fazendo ponte entre **Retrofit** e **ViewModel**
- Exibição de estado de carga (`Loading / Success / Error`)
- Estrutura pronta para testes unitários de ViewModel

---
## 🏗️ Arquitetura do App

```
UI (Activity / Fragment)
   ↑  observes
ViewModel (LiveData / StateFlow)
   ↑  calls
Repository (interface)
   ├── RemoteDataSource (Retrofit)
   └── LocalDataSource  (Room)  # opcional
```

### Pacotes

```
com.yourpackage.mvvm
 ├─ data/
 │   ├─ model/
 │   ├─ remote/ApiService.kt
 │   └─ repository/UserRepository.kt
 ├─ ui/
 │   ├─ userlist/UserListFragment.kt
 │   └─ userdetail/UserDetailFragment.kt
 └─ MainActivity.kt
```

---

## 🎯 Pré‑requisitos

- Android Studio **Giraffe** (ou mais recente)
- JDK 17
- Emulador/dispositivo Android API 24+

---

## ⚙️ Executando o Projeto

```bash
git clone https://github.com/Lari30/AulaProjetoArquiteturaMVVM.git
cd AulaProjetoArquiteturaMVVM
# Abra no Android Studio e clique ▶️
```

---

## 🧪 Testes Sugeridos

- **JUnit + MockK** para `UserRepository`
- **JUnit + Coroutine Test** para `UserViewModel`
- **Espresso** para verificar exibição da RecyclerView

```kotlin
@Test fun userList_loads() = runTest {
    coEvery { api.getUsers() } returns listOf(User(1,"Alice"))
    viewModel.fetchUsers()
    assertEquals(1, viewModel.uiState.value.users.size)
}
```

---

## 🛣️ Roadmap

- [ ] Implementar cache com Room
- [ ] Paging 3 para lista longa
- [ ] Tema Dark Mode Material 3
- [ ] Workflow CI GitHub Actions

---

## 🤝 Como Contribuir

1. Faça um **fork**
2. Crie uma branch: `git checkout -b feature/minha-feature`
3. Commit: `git commit -m 'feat: adiciona xyz'`
4. Push: `git push origin feature/minha-feature`
5. Abra um **Pull Request**

---

## 📄 Licença

Este projeto está sob a licença MIT – consulte o arquivo **LICENSE**.

---

### Autor

Curso Android Avançado – Prof. **Jamilton Damasceno**  
Adaptado e mantido por **Larissa Santos** – [LinkedIn](https://www.linkedin.com/in/larissa-santos-478961ab/)
