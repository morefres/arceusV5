.class public final synthetic Lyo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lyo/e;


# direct methods
.method public synthetic constructor <init>(Lyo/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/a;->a:Lyo/e;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lyo/a;->a:Lyo/e;

    invoke-static {v0, p1}, Lyo/e;->A2(Lyo/e;Landroid/view/View;)V

    return-void
.end method
