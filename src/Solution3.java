import java.util.*;
import java.io.*;
public class Solution3 {



        public static void main(String[] argh) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt(); // Number of queries

            // Loop through each query
            for (int i = 0; i < t; i++) {
                int a = in.nextInt(); // Base number
                int b = in.nextInt(); // Increment multiplier
                int n = in.nextInt(); // Number of terms in the series

                // Initialize the sum with 'a'
                int sum = a;

                // Build the series
                for (int j = 0; j < n; j++) {
                    sum += Math.pow(2, j) * b; // Add 2^j * b to the sum
                    System.out.print(sum + " "); // Print the current term in the series
                }
                System.out.println(); // Move to the next line for the next query
            }
            in.close();
        }
    }

/*
**Gusobanura ikibazo n'uburyo bwo kugikemura mu Kinyarwanda:**

---

### **Ikibazo**
Ugomba gukora urutonde rw’imibare hashingiwe ku mibare itatu: \(a\), \(b\), na \(n\). Ku nyandiko imwe, ugomba kubara uru rutonde uko rugenda rwiyongera ku buryo bukurikira:

\[
S_1 = a + 2^0 \cdot b, \, S_2 = a + 2^0 \cdot b + 2^1 \cdot b, \, \dots, \, S_n = a + 2^0 \cdot b + 2^1 \cdot b + \dots + 2^{n-1} \cdot b
\]

#### **Ibyinjizwa mu porogaramu (Input)**
1. Umurongo wa mbere ugomba kuba urimo umubare \(t\) ugaragaza umubare w'ibibazo cyangwa inyandiko (queries).
2. Imirongo ikurikiraho izaba irimo \(a\), \(b\), na \(n\):
   - \(a\): Umubare w’ibanze (base value).
   - \(b\): Umubare wikubirwa n’imbaraga za 2 (multiplier).
   - \(n\): Umubare w’ibice bigize urwo rutonde (terms).

#### **Ibisohoka (Output)**
Ukoresheje imibare itanzwe, ugomba kwerekana urutonde rw’ibice \(n\) kuri buri kibazo, buri kimwe kikandikwa ku murongo wacyo.

#### **Amabwiriza y’ikibazo**
- \(0 \leq a, b \leq 50\)
- \(1 \leq n \leq 15\)
- \(0 \leq t \leq 500\)

---

### **Ubusobanuro bw'Ibisubizo**

### **Inzira yo Gukemura**
1. **Gufata ibyinjizwa (Inputs)**:
   - Soma umubare \(t\), ugaragaza umubare w'inyandiko (queries).
   - Soma buri kibazo kigizwe na \(a\), \(b\), na \(n\).

2. **Kubara urutonde rw'ibice (Series)**:
   - Tangirira kuri \( \text{sum} = a \).
   - Ukoresheje umuzenguruko (loop), usanga buri gice \(j\) hakoreshejwe:
     \[
     \text{sum} = a + (2^0 \cdot b) + (2^1 \cdot b) + \dots + (2^j \cdot b)
     \]

3. **Koresha uburyo bwihuse bwo kubara \(2^j\)**:
   - Ahubwo yo gukoresha `Math.pow(2, j)` (ishobora gutinza kubera imibare ya floating-point), kora **bitwise shifting**: \(2^j = 1 \ll j\).

4. **Kwandika Ibisubizo**:
   - Fungura umuzenguruko kuri buri kibazo.
   - Fata ibyavuyeho byose ubisohore ku murongo umwe, hagatanyijwe n'imboneko (" ").

---

### **Gusobanura Ikode**

#### 1. **Gufata ibyinjizwa**:
```java
int t = in.nextInt(); // Umubare w'inyandiko (queries)
int a = in.nextInt(); // Umubare w’ibanze
int b = in.nextInt(); // Umubare wikubirwa
int n = in.nextInt(); // Umubare w’ibice
```

#### 2. **Kubara urutonde rw’ibice**:
```java
int sum = a; // Tangirira ku mubare w’ibanze 'a'
```
- Tangirira ku mubare w’ibanze \(a\).

```java
for (int j = 0; j < n; j++) {
    sum += (1 << j) * b; // Kubara 2^j hakoreshejwe bitwise shift
    System.out.print(sum + " "); // Andika igice cya buri ntambwe
}
```
- `(1 << j)` itanga igisubizo cya \(2^j\) ku buryo bwihuse.
- Fata umubare ubonetse, uwongere kuri \(sum\), hanyuma uwandike.

#### 3. **Kurangiza Umurongo**:
```java
System.out.println();
```
- Iyo urutonde rw'inyandiko rumaze kurangira, andika umurongo mushya.

---

### **Urugero rwo Gusobanura**

#### Inputs:
```
2
0 2 5
5 3 3
```

#### Ikibazo cya 1: \(a = 0, b = 2, n = 5\)
1. \(S_1 = 0 + 2^0 \cdot 2 = 2\)
2. \(S_2 = 2 + 2^1 \cdot 2 = 6\)
3. \(S_3 = 6 + 2^2 \cdot 2 = 14\)
4. \(S_4 = 14 + 2^3 \cdot 2 = 30\)
5. \(S_5 = 30 + 2^4 \cdot 2 = 62\)

**Ibisohoka**:
```
2 6 14 30 62
```

#### Ikibazo cya 2: \(a = 5, b = 3, n = 3\)
1. \(S_1 = 5 + 2^0 \cdot 3 = 8\)
2. \(S_2 = 8 + 2^1 \cdot 3 = 14\)
3. \(S_3 = 14 + 2^2 \cdot 3 = 26\)

**Ibisohoka**:
```
8 14 26
```

#### Ibisubizo bya Nyuma:
```
2 6 14 30 62
8 14 26
```

---

### **Impamvu Ikode ikora neza**
- **Kwihuta**: Koresha \(O(t \cdot n)\), bikaba bihagije mu byifuzo.
- **Gukosora neza**: Koresha "bitwise shift" mu gukemura ibibazo bya `Math.pow`.
- **Kworoshya kubikora kenshi**: Ubashije kwiga uburyo urutonde rugenda rukorwa neza.

Wambwira niba hari ahandi usobanura birenzeho cyangwa ukaba ufite ikibazo cy'ibindi!
 */
