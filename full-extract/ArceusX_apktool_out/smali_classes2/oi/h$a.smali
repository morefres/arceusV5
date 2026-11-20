.class public Loi/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/h;->b(Landroid/content/Context;ZLoi/h$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Loi/h$c;

.field public final synthetic d:Loi/h;


# direct methods
.method public constructor <init>(Loi/h;ZLandroid/content/Context;Loi/h$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Loi/h$a;->d:Loi/h;

    iput-boolean p2, p0, Loi/h$a;->a:Z

    iput-object p3, p0, Loi/h$a;->b:Landroid/content/Context;

    iput-object p4, p0, Loi/h$a;->c:Loi/h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Loi/f;Loi/f;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Loi/h$a;->a:Z

    if-nez v0, :cond_1

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->i()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "persisting loginSignUpLocale locale: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Loi/h$a;->d:Loi/h;

    iget-object v0, v0, Loi/h;->b:Loi/b;

    iget-object v1, p0, Loi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Loi/b;->o(Loi/f;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Loi/h$a;->d:Loi/h;

    iget-object p1, p1, Loi/h;->b:Loi/b;

    iget-object v0, p0, Loi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Loi/b;->d(Landroid/content/Context;)Loi/f;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Loi/h$a;->d:Loi/h;

    iget-object v0, v0, Loi/h;->b:Loi/b;

    sget-object v1, Loi/b$c;->a:Loi/b$c;

    invoke-virtual {v0, v1}, Loi/b;->s(Loi/b$c;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Loi/h$a;->d:Loi/h;

    iget-object p1, p1, Loi/h;->b:Loi/b;

    sget-object v0, Loi/b$c;->b:Loi/b$c;

    invoke-virtual {p1, v0}, Loi/b;->s(Loi/b$c;)V

    move-object p1, p2

    :goto_1
    iget-object v0, p0, Loi/h$a;->d:Loi/h;

    iget-object v0, v0, Loi/h;->b:Loi/b;

    iget-object v1, p0, Loi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p3}, Loi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p3, p0, Loi/h$a;->d:Loi/h;

    iget-object p3, p3, Loi/h;->b:Loi/b;

    invoke-virtual {p3, p2}, Loi/b;->r(Loi/f;)V

    iget-object p2, p0, Loi/h$a;->d:Loi/h;

    iget-object p2, p2, Loi/h;->b:Loi/b;

    iget-object p3, p0, Loi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p2, p1, p3}, Loi/b;->n(Loi/f;Landroid/content/Context;)Z

    move-result p1

    iget-object p2, p0, Loi/h$a;->c:Loi/h$c;

    invoke-interface {p2, p1}, Loi/h$c;->a(Z)V

    return-void
.end method
