.class public Loi/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/h;->c(Landroid/content/Context;Loi/h$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Loi/h$d;

.field public final synthetic c:Loi/h;


# direct methods
.method public constructor <init>(Loi/h;Landroid/content/Context;Loi/h$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Loi/h$b;->c:Loi/h;

    iput-object p2, p0, Loi/h$b;->a:Landroid/content/Context;

    iput-object p3, p0, Loi/h$b;->b:Loi/h$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Loi/f;Loi/f;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lti/h;->e()Lti/h;

    move-result-object v0

    invoke-virtual {v0}, Lti/h;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Loi/h$b;->c:Loi/h;

    iget-object v0, v0, Loi/h;->b:Loi/b;

    invoke-virtual {v0}, Loi/b;->g()Loi/b$c;

    move-result-object v0

    sget-object v1, Loi/b$c;->b:Loi/b$c;

    if-ne v0, v1, :cond_1

    :goto_0
    move-object p1, p2

    :cond_1
    iget-object p2, p0, Loi/h$b;->c:Loi/h;

    iget-object p2, p2, Loi/h;->b:Loi/b;

    iget-object v0, p0, Loi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p3}, Loi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p0, Loi/h$b;->b:Loi/h$d;

    iget-object p3, p0, Loi/h$b;->c:Loi/h;

    iget-object p3, p3, Loi/h;->b:Loi/b;

    iget-object v0, p0, Loi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p3, p1, v0}, Loi/b;->n(Loi/f;Landroid/content/Context;)Z

    move-result p1

    invoke-interface {p2, p1}, Loi/h$d;->a(Z)V

    return-void
.end method
