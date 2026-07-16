package v.s;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class EhHlMwmHiuOWUADRbJs5 extends wA1wgbvy8fId8a {
    public int JXn4Qf7zpnLjP5;
    public File[] vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;

    private static /* synthetic */ void wdykztpmq() {
    }

    @Override // v.s.BWK2ncTYuVFSp
    public final File dDIMxZXP1V8HdM() {
        boolean z = this.w9sT1Swbhx3hs;
        File file = this.dDIMxZXP1V8HdM;
        if (!z) {
            this.w9sT1Swbhx3hs = true;
            return file;
        }
        File[] fileArr = this.vekpFI4d1Nc4fakF;
        if (fileArr != null && this.JXn4Qf7zpnLjP5 >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.vekpFI4d1Nc4fakF = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.vekpFI4d1Nc4fakF;
        int i = this.JXn4Qf7zpnLjP5;
        this.JXn4Qf7zpnLjP5 = i + 1;
        return fileArr2[i];
    }
}
