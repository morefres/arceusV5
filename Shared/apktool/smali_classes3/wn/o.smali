.class public final synthetic Lwn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwn/p;


# direct methods
.method public synthetic constructor <init>(Lwn/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/o;->a:Lwn/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwn/o;->a:Lwn/p;

    invoke-static {v0}, Lwn/p;->c(Lwn/p;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
