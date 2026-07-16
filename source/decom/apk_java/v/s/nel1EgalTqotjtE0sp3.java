package v.s;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class nel1EgalTqotjtE0sp3 implements zzxeBctTPcbuazkjVgh {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ nel1EgalTqotjtE0sp3(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    @Override // v.s.zzxeBctTPcbuazkjVgh
    public final Object get() {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String str = (String) this.w9sT1Swbhx3hs;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new sDgcDBza3rQMfgE4gHaI("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new sDgcDBza3rQMfgE4gHaI("Could not instantiate " + str + ".", e);
                } catch (InstantiationException e2) {
                    throw new sDgcDBza3rQMfgE4gHaI("Could not instantiate " + str + ".", e2);
                } catch (NoSuchMethodException e3) {
                    throw new sDgcDBza3rQMfgE4gHaI("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new sDgcDBza3rQMfgE4gHaI("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) this.w9sT1Swbhx3hs;
            default:
                return new hmfmd9D4FOI4fG32Hxj((dfwkxUDiclPw1BowH4) this.w9sT1Swbhx3hs);
        }
    }
}
