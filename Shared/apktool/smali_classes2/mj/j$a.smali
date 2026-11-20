.class public Lmj/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyj/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmj/j;->a(Landroid/content/Context;Lnj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lk2/k$f;

.field public final synthetic c:Lnj/f;

.field public final synthetic d:Lyj/k0;

.field public final synthetic e:Lmj/j;


# direct methods
.method public constructor <init>(Lmj/j;Landroid/content/Context;Lk2/k$f;Lnj/f;Lyj/k0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmj/j$a;->e:Lmj/j;

    iput-object p2, p0, Lmj/j$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lmj/j$a;->b:Lk2/k$f;

    iput-object p4, p0, Lmj/j$a;->c:Lnj/f;

    iput-object p5, p0, Lmj/j$a;->d:Lyj/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lmj/j$a;->e:Lmj/j;

    iget-object v1, p0, Lmj/j$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lmj/j$a;->b:Lk2/k$f;

    iget-object v3, p0, Lmj/j$a;->c:Lnj/f;

    invoke-static {v0, v1, v2, v3}, Lmj/j;->i(Lmj/j;Landroid/content/Context;Lk2/k$f;Lnj/f;)V

    iget-object v0, p0, Lmj/j$a;->d:Lyj/k0;

    invoke-virtual {v0, p0}, Lyj/k0;->R(Lyj/e0;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lmj/j$a;->d:Lyj/k0;

    invoke-virtual {v0, p0}, Lyj/k0;->R(Lyj/e0;)V

    return-void
.end method
