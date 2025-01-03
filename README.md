# How to Download and Install Java Development Kit (JDK) on Windows

This guide explains how to download and install the Java Development Kit (JDK) on Windows. 
The JDK is required for Java development and includes essential tools like the Java compiler (`javac`) and the Java Runtime Environment (`JRE`).

---

## Table of Contents

1. [Download JDK](#download-jdk)
2. [Install JDK on Windows](#install-jdk-on-windows)
3. [Set Environment Variables](#set-environment-variables)
4. [Verify Installation](#verify-installation)

---

## 1. Download JDK

Follow these steps to download the latest version of the JDK:

1. **Visit the Oracle JDK download page**:  
   Go to the [official Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or choose the version you need (e.g., JDK 11, JDK 17).

2. **Select the Windows version**:  
   - On the download page, under the **"JDK"** section, select **Windows**.
   - Download the **Windows x64 Installer** (`.exe` file).

3. **Accept the License Agreement**:  
   You must accept the Oracle License Agreement to proceed with the download.

4. **Download the installer**:  
   Click the **Download** button to begin downloading the `.exe` installer.

---

## 2. Install JDK on Windows

1. **Run the Installer**:  
   After the `.exe` file is downloaded, double-click on it to begin the installation process.

2. **Follow the Installation Wizard**:
   - The setup wizard will guide you through the installation process.
   - **Installation Folder**: Choose the default folder or select a different one (e.g., `C:\Program Files\Java\`).
   - You can also select optional features like **Install public JRE** (optional) during the setup.
   - Click **Next** and then **Install** to begin the installation.

3. **Complete the Installation**:
   Once the installation is complete, click **Close** to exit the installer.

---

## 3. Set Environment Variables

After installing the JDK, you need to set up the **`JAVA_HOME`** environment variable and update the **`Path`** variable so that the `java` and `javac` commands work from the Command Prompt.

### 1. Set `JAVA_HOME`:

1. **Open the System Properties**:  
   Right-click on **This PC** (or **Computer**) and select **Properties**.
   
2. **Advanced System Settings**:  
   Click **Advanced system settings** on the left side, then click the **Environment Variables** button.

3. **Create a New System Variable**:
   - Under **System variables**, click **New**.
   - Set the **Variable name** as `JAVA_HOME`.
   - Set the **Variable value** to the path of the JDK installation directory. This will typically be:
     ```
     C:\Program Files\Java\jdk-<version>
     ```
     (Replace `<version>` with the specific JDK version number, e.g., `jdk-17.0.1`.)

4. **Click OK** to save the new variable.

### 2. Update `Path` Variable:

1. **Edit the `Path` variable**:  
   In the **Environment Variables** window, under **System variables**, find the **Path** variable and click **Edit**.

2. **Add JDK `bin` Directory**:  
   Click **New** and add the path to the **`bin`** folder inside the JDK installation directory:
