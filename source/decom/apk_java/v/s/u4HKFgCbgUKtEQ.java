package v.s;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class u4HKFgCbgUKtEQ extends y6jRGLEWNMir {
    public static boolean EWUjsTERgdPbSw3NNlN(File file) {
        KS4YipXRvfigcW kS4YipXRvfigcW = new KS4YipXRvfigcW(new OxLFCGMMwTLJfW(file));
        while (true) {
            boolean z = true;
            while (kS4YipXRvfigcW.hasNext()) {
                File file2 = (File) kS4YipXRvfigcW.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static void dTS0S7eC32ubQH54j36(File file, String str) throws IOException {
        byte[] bytes = str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static String vIJudZvPyTuNp(File file) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
        try {
            String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(inputStreamReader);
            inputStreamReader.close();
            return strPyu8ovAipBTLYAiKab;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static byte[] yTljMGnIibTRdOpSh4(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    l0O7oCCrFmwv24e5os2o l0o7occrfmwv24e5os2o = new l0O7oCCrFmwv24e5os2o(8193);
                    l0o7occrfmwv24e5os2o.write(i5);
                    OFtLBiBbrrTHWu.b1EoSIRjJHO5(fileInputStream, l0o7occrfmwv24e5os2o);
                    int size = l0o7occrfmwv24e5os2o.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrDDIMxZXP1V8HdM = l0o7occrfmwv24e5os2o.dDIMxZXP1V8HdM();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrDDIMxZXP1V8HdM, 0, bArrCopyOf, i, l0o7occrfmwv24e5os2o.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileInputStream, th);
                throw th2;
            }
        }
    }

    private static /* synthetic */ void zuizo() {
    }
}
