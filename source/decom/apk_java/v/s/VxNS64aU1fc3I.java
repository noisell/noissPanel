package v.s;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class VxNS64aU1fc3I {
    public final Hnsrhf2jJV8dCt dDIMxZXP1V8HdM;
    public final HashMap vekpFI4d1Nc4fakF;
    public final eTeIZwLyooQrZ0ICI9i w9sT1Swbhx3hs;

    public VxNS64aU1fc3I(Context context, eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i) {
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = new Hnsrhf2jJV8dCt(context, 3);
        this.vekpFI4d1Nc4fakF = new HashMap();
        this.dDIMxZXP1V8HdM = hnsrhf2jJV8dCt;
        this.w9sT1Swbhx3hs = eteizwlyooqrz0ici9i;
    }

    public final synchronized bLhN5yakPGE6G dDIMxZXP1V8HdM(String str) {
        if (this.vekpFI4d1Nc4fakF.containsKey(str)) {
            return (bLhN5yakPGE6G) this.vekpFI4d1Nc4fakF.get(str);
        }
        CctBackendFactory cctBackendFactoryVekpFI4d1Nc4fakF = this.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF(str);
        if (cctBackendFactoryVekpFI4d1Nc4fakF == null) {
            return null;
        }
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = this.w9sT1Swbhx3hs;
        bLhN5yakPGE6G blhn5yakpge6gCreate = cctBackendFactoryVekpFI4d1Nc4fakF.create(new UxNlA85FNGxD5ioQ((Context) eteizwlyooqrz0ici9i.w9sT1Swbhx3hs, (bYZKmsM130y5GVhnn) eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF, (bYZKmsM130y5GVhnn) eteizwlyooqrz0ici9i.JXn4Qf7zpnLjP5, str));
        this.vekpFI4d1Nc4fakF.put(str, blhn5yakpge6gCreate);
        return blhn5yakpge6gCreate;
    }
}
