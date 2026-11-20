.class public final synthetic Lpp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lpp/h;


# direct methods
.method public synthetic constructor <init>(Lpp/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/d;->a:Lpp/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpp/d;->a:Lpp/h;

    invoke-static {v0}, Lpp/h;->a(Lpp/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
