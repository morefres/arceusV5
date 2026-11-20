.class public final synthetic Lar/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lar/n;


# direct methods
.method public synthetic constructor <init>(Lar/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/m;->a:Lar/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lar/m;->a:Lar/n;

    invoke-static {v0}, Lar/n;->a(Lar/n;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
