package v.s;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class MnLRqMow83uotly4qYT {
    public static final MnLRqMow83uotly4qYT w9sT1Swbhx3hs;
    public final HashMap dDIMxZXP1V8HdM;

    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("Data");
        MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT = new MnLRqMow83uotly4qYT(new HashMap());
        w9sT1Swbhx3hs(mnLRqMow83uotly4qYT);
        w9sT1Swbhx3hs = mnLRqMow83uotly4qYT;
    }

    public MnLRqMow83uotly4qYT(MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT) {
        this.dDIMxZXP1V8HdM = new HashMap(mnLRqMow83uotly4qYT.dDIMxZXP1V8HdM);
    }

    public static MnLRqMow83uotly4qYT dDIMxZXP1V8HdM(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (IOException | ClassNotFoundException unused) {
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    return new MnLRqMow83uotly4qYT(map);
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException unused3) {
                        throw th;
                    }
                }
            } catch (IOException unused4) {
            }
        } catch (IOException | ClassNotFoundException unused5) {
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused6) {
        }
        return new MnLRqMow83uotly4qYT(map);
    }

    public static byte[] w9sT1Swbhx3hs(MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(mnLRqMow83uotly4qYT.dDIMxZXP1V8HdM.size());
                    for (Map.Entry entry : mnLRqMow83uotly4qYT.dDIMxZXP1V8HdM.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused8) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && MnLRqMow83uotly4qYT.class == obj.getClass()) {
                HashMap map = ((MnLRqMow83uotly4qYT) obj).dDIMxZXP1V8HdM;
                HashMap map2 = this.dDIMxZXP1V8HdM;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.dDIMxZXP1V8HdM.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.dDIMxZXP1V8HdM;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public MnLRqMow83uotly4qYT(HashMap map) {
        this.dDIMxZXP1V8HdM = new HashMap(map);
    }
}
