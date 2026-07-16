package v.s;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class yNYEpdVbN7wPXf5 implements InvocationHandler {
    public final ArrayList dDIMxZXP1V8HdM;
    public String vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;

    public yNYEpdVbN7wPXf5(ArrayList arrayList) {
        this.dDIMxZXP1V8HdM = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "supports") && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "unsupported") && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(Void.TYPE, returnType)) {
            this.w9sT1Swbhx3hs = true;
            return null;
        }
        boolean zW9sT1Swbhx3hs = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "protocols");
        ArrayList arrayList = this.dDIMxZXP1V8HdM;
        if (zW9sT1Swbhx3hs && objArr.length == 0) {
            return arrayList;
        }
        if ((okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "selectProtocol") || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list.get(i);
                        if (arrayList.contains(str)) {
                            this.vekpFI4d1Nc4fakF = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.vekpFI4d1Nc4fakF = str2;
                return str2;
            }
        }
        if ((!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "protocolSelected") && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.vekpFI4d1Nc4fakF = (String) objArr[0];
        return null;
    }
}
