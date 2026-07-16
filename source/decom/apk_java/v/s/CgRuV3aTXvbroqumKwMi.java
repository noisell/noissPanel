package v.s;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class CgRuV3aTXvbroqumKwMi {
    public final Sn2d19yOBfyV0rw dDIMxZXP1V8HdM;
    public final Sn2d19yOBfyV0rw vekpFI4d1Nc4fakF;
    public final Sn2d19yOBfyV0rw w9sT1Swbhx3hs;

    public CgRuV3aTXvbroqumKwMi(Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw2, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw3) {
        this.dDIMxZXP1V8HdM = sn2d19yOBfyV0rw;
        this.w9sT1Swbhx3hs = sn2d19yOBfyV0rw2;
        this.vekpFI4d1Nc4fakF = sn2d19yOBfyV0rw3;
    }

    private static /* synthetic */ void yvnxetyu() {
    }

    public abstract boolean Ee8d2j4S9Vm5yGuR(int i);

    public final Method JXn4Qf7zpnLjP5(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = this.w9sT1Swbhx3hs;
        Method method = (Method) sn2d19yOBfyV0rw.get(name);
        if (method != null) {
            return method;
        }
        Class clsW9sT1Swbhx3hs = w9sT1Swbhx3hs(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsW9sT1Swbhx3hs.getDeclaredMethod("write", cls, CgRuV3aTXvbroqumKwMi.class);
        sn2d19yOBfyV0rw.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract void b1EoSIRjJHO5(int i);

    public abstract fpLUurEzh4fb4JIu1w4 dDIMxZXP1V8HdM();

    public final uhZmrHoOCxNeh ibVTtJUNfrGYbW() {
        String string = ((fpLUurEzh4fb4JIu1w4) this).Ee8d2j4S9Vm5yGuR.readString();
        if (string == null) {
            return null;
        }
        try {
            return (uhZmrHoOCxNeh) vekpFI4d1Nc4fakF(string).invoke(null, dDIMxZXP1V8HdM());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final void pyu8ovAipBTLYAiKab(uhZmrHoOCxNeh uhzmrhoocxneh) {
        if (uhzmrhoocxneh == null) {
            ((fpLUurEzh4fb4JIu1w4) this).Ee8d2j4S9Vm5yGuR.writeString(null);
            return;
        }
        try {
            ((fpLUurEzh4fb4JIu1w4) this).Ee8d2j4S9Vm5yGuR.writeString(w9sT1Swbhx3hs(uhzmrhoocxneh.getClass()).getName());
            fpLUurEzh4fb4JIu1w4 fpluurezh4fb4jiu1w4DDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
            try {
                JXn4Qf7zpnLjP5(uhzmrhoocxneh.getClass()).invoke(null, uhzmrhoocxneh, fpluurezh4fb4jiu1w4DDIMxZXP1V8HdM);
                Parcel parcel = fpluurezh4fb4jiu1w4DDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR;
                int i = fpluurezh4fb4jiu1w4DDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab;
                if (i >= 0) {
                    int i2 = fpluurezh4fb4jiu1w4DDIMxZXP1V8HdM.JXn4Qf7zpnLjP5.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(uhzmrhoocxneh.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final Method vekpFI4d1Nc4fakF(String str) throws NoSuchMethodException {
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = this.dDIMxZXP1V8HdM;
        Method method = (Method) sn2d19yOBfyV0rw.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, CgRuV3aTXvbroqumKwMi.class.getClassLoader()).getDeclaredMethod("read", CgRuV3aTXvbroqumKwMi.class);
        sn2d19yOBfyV0rw.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class w9sT1Swbhx3hs(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        Sn2d19yOBfyV0rw sn2d19yOBfyV0rw = this.vekpFI4d1Nc4fakF;
        Class cls2 = (Class) sn2d19yOBfyV0rw.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        sn2d19yOBfyV0rw.put(cls.getName(), cls3);
        return cls3;
    }

    public final Parcelable xDyLpEZyrcKVe0(Parcelable parcelable, int i) {
        if (!Ee8d2j4S9Vm5yGuR(i)) {
            return parcelable;
        }
        return ((fpLUurEzh4fb4JIu1w4) this).Ee8d2j4S9Vm5yGuR.readParcelable(fpLUurEzh4fb4JIu1w4.class.getClassLoader());
    }
}
