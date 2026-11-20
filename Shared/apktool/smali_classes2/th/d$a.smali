.class public Lth/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lth/d;->onAppLocaleChangeEvent(Loh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lth/d;


# direct methods
.method public constructor <init>(Lth/d;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lth/d$a;->b:Lth/d;

    iput-object p2, p0, Lth/d$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const-string v0, "rbx.locale"

    const-string v1, "onAppLanguageChangeEvent(), Api call to get locale values"

    invoke-static {v0, v1}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lth/d$a;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lth/d$a;->b:Lth/d;

    invoke-static {v0}, Lth/d;->M3(Lth/d;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lth/d$a;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    iget-object p1, p0, Lth/d$a;->a:Landroid/app/Activity;

    instance-of v0, p1, Lcom/roblox/client/ActivityNativeMain;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void
.end method
