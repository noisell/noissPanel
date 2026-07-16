package v.s;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JAq04eEIRbdKN3s5wgEm {
    public boolean Ee8d2j4S9Vm5yGuR = false;
    public final String JXn4Qf7zpnLjP5;
    public final r5XEUfod5GSCCwq6c dDIMxZXP1V8HdM;
    public byte[] ibVTtJUNfrGYbW;
    public final File vekpFI4d1Nc4fakF;
    public final byte[] w9sT1Swbhx3hs;
    public SvaRwOgSe9xmOs[] xDyLpEZyrcKVe0;

    public JAq04eEIRbdKN3s5wgEm(AssetManager assetManager, UE6365QWSHVg5Fff uE6365QWSHVg5Fff, r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c, String str, File file) {
        this.dDIMxZXP1V8HdM = r5xeufod5gsccwq6c;
        this.JXn4Qf7zpnLjP5 = str;
        this.vekpFI4d1Nc4fakF = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 26:
                    bArr = gA5gCwTK0qjTIn.xDyLpEZyrcKVe0;
                    break;
                case 27:
                    bArr = gA5gCwTK0qjTIn.Ee8d2j4S9Vm5yGuR;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = gA5gCwTK0qjTIn.JXn4Qf7zpnLjP5;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = gA5gCwTK0qjTIn.vekpFI4d1Nc4fakF;
                    break;
            }
        }
        this.w9sT1Swbhx3hs = bArr;
    }

    public final FileInputStream dDIMxZXP1V8HdM(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void w9sT1Swbhx3hs(int i, Serializable serializable) {
        new TSNDB0Gzi30d(this, i, serializable, 56 - 55).run();
    }
}
