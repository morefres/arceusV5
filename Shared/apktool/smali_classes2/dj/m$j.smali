.class public Ldj/m$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/purchase/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/m;


# direct methods
.method public constructor <init>(Ldj/m;)V
    .locals 0

    iput-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lfj/b;)V
    .locals 3

    iget-object v0, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {v0}, Ldj/m;->B(Ldj/m;)Lti/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ValidationCheck: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lti/g;->l(Ljava/lang/String;)V

    sget-object v0, Ldj/m$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->n0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->w:Ldj/e$b;

    const-string v0, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->j0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->g:Ldj/e$b;

    const-string v0, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->l0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->f:Ldj/e$b;

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->l0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->e:Ldj/e$b;

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->m0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->d:Ldj/e$b;

    const-string v0, "PrePurchaseValidation retry"

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1}, Ldj/m;->k0(Ldj/m;)V

    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    sget-object p3, Ldj/e$b;->c:Ldj/e$b;

    const-string v0, "PrePurchaseValidation error"

    invoke-static {p1, p2, p3, v0}, Ldj/m;->c0(Ldj/m;Ljava/lang/String;Ldj/e$b;Ljava/lang/String;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Ldj/m$j;->a:Ldj/m;

    invoke-static {p1, p3}, Ldj/m;->N(Ldj/m;Lfj/b;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
