# Chat App/ WhatsApp Clone
 This project is an Android chat application designed to explore and master Firebase concepts while adhering to the MVVM (Model-View-ViewModel) architectural pattern. The application demonstrates how to use Firebase for user authentication, real-time database operations, and dynamic group messaging.

## **Features**

### **Firebase Integration**
- Anonymous login and authentication using Firebase Authentication.
- Real-time synchronization of messages and groups with Firebase Realtime Database.

### **MVVM Architecture**
- **Model**: Encapsulates data and business logic, interacting with Firebase for data retrieval and updates.
- **ViewModel**: Acts as an intermediary, providing the UI with transformed and observable data while handling user interactions.
- **View**: Responsible for rendering the user interface, implemented with XML layouts and Android widgets.

### **Dynamic Group Messaging**
- Display existing chat groups such as Family and University.
- Add new chat groups dynamically, which are instantly synced to Firebase.

### **Chat Features**
- User-specific message display:
  - Messages sent by the user are shown in **purple**.
  - Messages sent by others are shown in **gray**.
- Real-time updates: Messages appear instantly across devices.

### **Seamless Navigation**
- **Login Activity**: Handles anonymous login and authentication.
- **Groups Activity**: Displays a list of available groups and allows users to create new ones.
- **Chat Activity**: Displays messages for the selected group and enables real-time communication.

---

## **Technologies Used**
- **Firebase**: Authentication, Realtime Database.
- **MVVM Architecture**:
  - Android ViewModel for managing UI-related data across lifecycle changes.
  - Data binding between ViewModel and XML layouts.
- **Android Components**: Activities, RecyclerView, LiveData, etc.
- **Kotlin/Java**: For implementing application logic and Firebase interactions.
