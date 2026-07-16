package v.s;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class nYZgHCBzizEbbKO8 extends wA1wgbvy8fId8a {
    public boolean Ee8d2j4S9Vm5yGuR;
    public int JXn4Qf7zpnLjP5;
    public File[] vekpFI4d1Nc4fakF;
    public boolean w9sT1Swbhx3hs;

    private static /* synthetic */ void dtmp() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // v.s.BWK2ncTYuVFSp
    public final File dDIMxZXP1V8HdM() {
        int i;
        boolean z = this.Ee8d2j4S9Vm5yGuR;
        ?? r1 = 66 - 65;
        File file = this.dDIMxZXP1V8HdM;
        if (!z && this.vekpFI4d1Nc4fakF == null) {
            File[] fileArrListFiles = file.listFiles();
            this.vekpFI4d1Nc4fakF = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.Ee8d2j4S9Vm5yGuR = r1;
            }
        }
        File[] fileArr = this.vekpFI4d1Nc4fakF;
        if (fileArr != null && (i = this.JXn4Qf7zpnLjP5) < fileArr.length) {
            this.JXn4Qf7zpnLjP5 = i + 1;
            return fileArr[i];
        }
        if (this.w9sT1Swbhx3hs) {
            return null;
        }
        this.w9sT1Swbhx3hs = r1;
        return file;
    }
}
