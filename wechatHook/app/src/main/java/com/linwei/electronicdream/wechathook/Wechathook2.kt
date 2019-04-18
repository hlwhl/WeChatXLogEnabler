package com.linwei.electronicdream.wechathook

import android.util.Log
import com.gh0u1l5.wechatmagician.spellbook.SpellBook
import com.gh0u1l5.wechatmagician.spellbook.SpellBook.isImportantWechatProcess
import com.gh0u1l5.wechatmagician.spellbook.util.BasicUtil.tryVerbosely
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.callbacks.XC_LoadPackage

class Wechathook2 : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        tryVerbosely{
            if (isImportantWechatProcess(lpparam)) {
                SpellBook.startup(lpparam, listOf(LogHook,MsgHook))
                Log.e("wechathook","Hook Succeed")
            }
        }
    }
}