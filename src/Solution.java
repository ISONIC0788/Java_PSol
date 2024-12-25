import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
/*
Iyi nyandiko ivuga ku **"issue" iba hagati ya `nextInt()` na `nextLine()` mu Java**, kandi bisobanura impamvu ukenera kwitondera uburyo ukoresha izi **method** ebyiri zikurikiranye.

### Ibisobanuro mu Kinyarwanda:
Iyo ukoresheje **`nextInt()`** muri Java, iyi **method** ifata gusa umubare w'ibimenyetso (digits) ivanye mu input (nk'umubare w'ubwoko bwa `int`). **Ariko ntifata umurongo mushya (`\n`) uba nyuma y'uwo mubare.** Uwo murongo mushya usigara muri buffer, kandi niba ukurikijeho **`nextLine()`**, iyi izahita ifata uwo murongo mushya wasigaye, bikaviramo gufata **ibyanditse ubusa**.

---

### Urugero rw'Iki Kibazo:
Reka tuvuge ko winjije ibi bikurikira:

```
42
Hello, World!
```

Iyo ukoresheje `scanner.nextInt()` na `scanner.nextLine()` uko bikurikiranye, **iki ni cyo kibaho**:
1. **`nextInt()`** ifata **42** mu input, ariko umurongo mushya (`\n`) usigara muri buffer.
2. Iyo uhise ukoresha **`nextLine()`**, iyi izafata uwo murongo mushya wasigaye, aho gufata **Hello, World!**.

Bivuze ko **`nextLine()`** izagarura igisubizo kitagira icyo kivuze (nk'aho yisomye ibyanditse ubusa).

---

### Uburyo bwo Gukemura Iki Kibazo:
Nyuma yo gukoresha **`nextInt()`**, ukenera gusiba umurongo mushya (`\n`) wasigaye muri buffer mbere yo gukoresha **`nextLine()`**. Uko bikorwa:

```java
scanner.nextLine(); // Gusiba umurongo mushya
```

---

### Urugero rw'Ibikora Neza:
```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Soma integer
        int integerValue = scanner.nextInt();

        // Siba umurongo mushya wasigaye
        scanner.nextLine();

        // Soma umurongo (String)
        String stringValue = scanner.nextLine();

        // Tanga output
        System.out.println("Integer: " + integerValue);
        System.out.println("String: " + stringValue);

        scanner.close();
    }
}
```

**Input:**
```
42
Hello, World!
```

**Output:**
```
Integer: 42
String: Hello, World!
```

---

### Impamvu y'Ibi:
- **`nextInt()`** ifata integer ariko ntisiba umurongo mushya.
- **`nextLine()`** isoma umurongo mushya wasigaye mu buffer niba utabanje kuwusiba.

Niba hari aho utumvise neza, ndakomeza kubisobanura!
 */
