.class public final synthetic Ldq/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ldq/k2;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Ldq/k2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/l1;->a:Ldq/k2;

    iput-boolean p2, p0, Ldq/l1;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldq/l1;->a:Ldq/k2;

    iget-boolean v1, p0, Ldq/l1;->b:Z

    check-cast p1, Laq/b$d;

    invoke-static {v0, v1, p1}, Ldq/k2;->b0(Ldq/k2;ZLaq/b$d;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
