.class public final synthetic Lup/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lup/p;

.field public final synthetic b:Lup/i;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lup/p;Lup/i;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/k;->a:Lup/p;

    iput-object p2, p0, Lup/k;->b:Lup/i;

    iput-object p3, p0, Lup/k;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Lup/k;->a:Lup/p;

    iget-object v1, p0, Lup/k;->b:Lup/i;

    iget-object v2, p0, Lup/k;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lup/p;->e(Lup/p;Lup/i;Landroid/content/Context;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
