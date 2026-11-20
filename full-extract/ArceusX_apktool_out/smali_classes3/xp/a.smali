.class public final synthetic Lxp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lyp/c;


# direct methods
.method public synthetic constructor <init>(Lyp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/a;->a:Lyp/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxp/a;->a:Lyp/c;

    invoke-static {v0}, Lxp/q;->w(Lyp/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
